create schema `orderdb`;
use `orderdb`;

create table `ordertable`(
`orderid` int(11) NOT NULL,
`custid` int(11) NOT NULL,
`custname` VARCHAR(20) NOT NULL,
`custemail` VARCHAR(20) NOT NULL,
`custphone` VARCHAR(20) NOT NULL,
`itemid` VARCHAR(20) NOT NULL,
`itemprice` int(11) NOT NULL,
`quantity` int(11) NOT NULL,
`pincode` int(11) NOT NULL,
`city` VARCHAR(20) NOT NULL,
`locality` VARCHAR(20) NOT NULL,
`door_no` VARCHAR(20) NOT NULL,
Primary key(`orderid`,`custid`));


select * from `ordertable`;