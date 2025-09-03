-- v2: migrations for add review column

ALTER TABLE tb_archives
ADD COLUMN review VARCHAR(255);