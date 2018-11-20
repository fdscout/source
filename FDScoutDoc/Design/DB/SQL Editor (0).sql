-- review record that have duplicate recall_nr
select * from 
(select count(recall_nr) count, recall_nr from fds_recall 
group by recall_nr
) c
where c.count > 1;
-- ----------------------------------------------

select c.*, a.* from fds_recall a
inner join fds_recall_xref b on a.recall_id = b.recall_id
inner join fds_product c on b.product_id = c.product_id
 where a.report_dt > STR_TO_DATE('11/10/2018', '%m/%d/%Y');



update fds_recall set recall_nr = recall_id where recall_nr = '';

select count(*) from fds_recall;



delete from fds_recall;
delete from fds_product;
delete from fds_address;
delete from fds_recall_xref;
delete from fds_meta_data;

select * from fds_recall;


select max(length(reason)) from fds_recall;   -- 983
select max(length(ini_firm_notification)) from fds_recall;   -- 81
select max(length(code_info)) from fds_recall;   -- 24941
select max(length(more_code_info)) from fds_recall;   -- 0
select max(length(distro_pattern)) from fds_recall;   -- 697

select * from fds_recall where length(code_info) > 20000;

select * from fds_recall a
inner join fds_recall_xref b on a.recall_id = b.recall_id
inner join fds_product c on b.product_id = c.product_id
where a.status = 'Ongoing'
order by a.report_dt desc;

select * from fds_recall  where status = 'Ongoing';
select * from fds_product where description like '%Safeway%' and status = 'Ongoing';

select count(recall_nr) from fds_recall a
inner join fds_recall_xref b on a.recall_id = b.recall_id
inner join fds_meta_data c on b.meta_data_id = c.meta_data_id
and c.result_type_cd = 2
order by a.report_dt desc;

select max(report_dt) from fds_recall;




alter table fds_recall add CONSTRAINT recall_nr_unique UNIQUE (recall_nr);

select * 
