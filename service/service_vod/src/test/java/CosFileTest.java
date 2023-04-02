import org.junit.Test;

/**
 * @Author:Su HangFei
 * @Date:2023-03-31 16 46
 * @Project:ggkt_parent
 */
public class CosFileTest {

    @Test
    public void testCosFileValues() {
        String endpoint = ConstantPropertiesUtil.END_POINT;
        String bucketName = ConstantPropertiesUtil.BUCKET_NAME;
        // 1 初始化用户身份信息（secretId, secretKey）。
        String secretId = ConstantPropertiesUtil.ACCESS_KEY_ID;
        String secretKey = ConstantPropertiesUtil.ACCESS_KEY_SECRET;
        System.out.println(secretKey);
//        System.out.println(endpoint+","+bucketName+","+secretId)+","+secretKey);
    }
}
