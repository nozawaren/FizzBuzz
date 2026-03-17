CREATE TABLE IF NOT EXISTS m_fizzbuzz(
    fizzbuzz_id INT PRIMARY KEY AUTO_INCREMENT,
	number int
);
CREATE TABLE IF NOT EXISTS m_result(
	risult_id int PRIMARY KEY AUTO_INCREMENT,
	result_num  int,
    fizzbuzz_result　VARCHAR(50)
);	
