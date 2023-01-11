package example.java;

import com.volcengine.tos.TOSV2;
import com.volcengine.tos.TOSV2ClientBuilder;
import com.volcengine.tos.TosClientException;
import com.volcengine.tos.TosServerException;
import com.volcengine.tos.model.object.DeleteObjectInput;
import com.volcengine.tos.model.object.DeleteObjectOutput;

public class DeleteObjectWithVersionIdExample {
    public static void main(String[] args) {
        String endpoint = "your endpoint";
        String region = "your region";
        String accessKey = "your access key";
        String secretKey = "your secret key";

        String bucketName = "bucket-example";
        String objectKey = "example_dir/example_object.txt";
        // 对象版本号，最新版本可以通过 headObject 接口获取
        // 如果需要获取对象的历史版本号，可以通过 listObjectVersions 接口获取
        String versionId = "the specific version id";

        TOSV2 tos = new TOSV2ClientBuilder().build(region, endpoint, accessKey, secretKey);

        try{
            DeleteObjectInput input = new DeleteObjectInput().setBucket(bucketName).setKey(objectKey).setVersionID(versionId);
            DeleteObjectOutput output = tos.deleteObject(input);
            System.out.println("deleteObject succeed.");
            System.out.println("is the object a delete marker? " + output.isDeleteMarker());
            System.out.println("the deleted version id is " + output.getVersionID());
        } catch (TosClientException e) {
            // 操作失败，捕获客户端异常，一般情况是请求参数错误，此时请求并未发送
            System.out.println("deleteObject failed");
            System.out.println("Message: " + e.getMessage());
            if (e.getCause() != null) {
                e.getCause().printStackTrace();
            }
        } catch (TosServerException e) {
            // 操作失败，捕获服务端异常，可以获取到从服务端返回的详细错误信息
            System.out.println("deleteObject failed");
            System.out.println("StatusCode: " + e.getStatusCode());
            System.out.println("Code: " + e.getCode());
            System.out.println("Message: " + e.getMessage());
            System.out.println("RequestID: " + e.getRequestID());
        } catch (Throwable t) {
            // 作为兜底捕获其他异常，一般不会执行到这里
            System.out.println("deleteObject failed");
            System.out.println("unexpected exception, message: " + t.getMessage());
        }
    }
}
