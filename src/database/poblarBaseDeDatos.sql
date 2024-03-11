#creo los alumnos
INSERT INTO Alumnos(nombre, matricula, contrasenia, correo) values 
	("Andres Barragan","22760549","myPasword","al22760549@ite.edu.mx"),
    ("Salvador Laguna","22760563","laguna123","al22760563@ite.edu.mx"),
    ("Danna Irais","22760505","AaaaA","al22760505@ite.edu.mx"),
    ("Miguel ohara","22760512","spider123","al22760512@ite.edu.mx"),
    ("Patricio Estrella","2290234","123456","al2290234@ite.edu.mx");

#creo los coordinadores
INSERT INTO Coordinador (nombre, cargo, numeroEmpleado, correo, contrasenia) values 
	("Danna Del Viento","Ingieneria en Sistemas","546702","cordSistemas@ite.edu.mx","sistems1"),
    ("Angel Romero","Ingieneria Electronica","543673","cordElectr@ite.edu.mx","electronicos"),
    ("Diego Soto","Ingieneria Mecatronica","769501","coordMecatronica","tumbado"),
    ("Rene Barragan","Licenciatura en Adiministracion","872376","cordAdmin@ite.edu.mx","contrasenia"),
    ("Juan De la Cruz","Ingieneria Agricola","312395","cordAgricola@ite.edu.mx","123456");


#creo las citas
INSERT INTO citas (citadorID, coordinadorID, hora, motivo, anio, estado, dia, mes) values 
	(5,1,1230,"Cambio de carrera",2024,'p',27,4),
    (4,2,0850,"Quejas con profesor",2024,'p',10,7),
    (3,3,1420,"Quejas generales",2024,'p',24,9),
    (2,4,1315,"Cambio de horario",2025,'c',14,2),
    (1,5,1200,"Cambio de carrera",2024,'c',13,3),
    
    (1,5,1200,"Cambio de carrera",2025,'d',1,9),
    (1,5,1200,"Cambio de carrera",2023,'r',15,12),
    
    (5,1,1230,"Cambio de horario",2024,'d',4,2),
    (5,1,1230,"Cambio de carrera",2023,'r',3,12);