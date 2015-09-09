import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        AmazonEC2Client ec2 = new AmazonEC2Client();
        Region usWest2 = Region.getRegion(Regions.US_WEST_2);
        ec2.setRegion(usWest2);
        RunInstancesRequest req = new RunInstancesRequest();
        req.setImageId("ami-5189a661");
        req.setInstanceType("t2.micro");
        req.setKeyName("aws_pt-user");

        req.setMinCount(1);
        req.setMaxCount(1);

        RunInstancesResult result = ec2.runInstances(req);
        System.out.println(result.toString());
    }

}
