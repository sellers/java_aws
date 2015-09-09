from boto.ec2.connection import EC2Connection

ec2 = EC2Connection()
req = ec2.run_instances('ami-5189a661',
                        instance_type='t2.micro',
                        key_name='aws_pt-user')
