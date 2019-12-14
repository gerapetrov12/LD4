(def studentsMarks {
"Sasha" 3 
"Gera" 2 
"Inese" 10 
"Vasja" 1 
"Petja" 4 
"Natasha" 7 
"Anja" 10 
"Lauris" 6 
"Sandra" 8 
"Krišjanis" 9
"Gosha" 5})

(def listOfMarks (vals (select-keys studentsMarks (for [[key value] studentsMarks :when (.endsWith key "a")] key))))

(float (/ (reduce + listOfMarks) (count listOfMarks)))