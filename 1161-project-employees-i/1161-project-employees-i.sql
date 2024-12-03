# Write your MySQL query statement below
select Project.project_id,ROund(AVG(Employee.experience_years),2)  as average_years from Project
Left join Employee On Project.employee_id=Employee.employee_id
Group by Project.project_id Order by Project.project_id;