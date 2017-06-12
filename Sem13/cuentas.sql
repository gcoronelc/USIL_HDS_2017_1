CUENTA
chr_cuencodigo
chr_monecodigo
chr_sucucodigo
chr_emplcreacuenta
chr_cliecodigo
dec_cuensaldo
dtt_cuenfechacreacion
vch_cuenestado
int_cuencontmov
chr_cuenclave

CLIENTE
chr_cliecodigo   
vch_cliepaterno  
vch_cliematerno  
vch_clienombre   
chr_cliedni      
vch_clieciudad   
vch_cliedireccion
vch_clietelefono 
vch_clieemail    


MONEDA
chr_monecodigo
vch_monedescripcion


SELECT 
CU.chr_cuencodigo cuenta, 
MO.vch_monedescripcion moneda, 
CU.dec_cuensaldo saldo, 
CU.vch_cuenestado estado,  
concat(CL.vch_cliepaterno, 
', ', CL.vch_clienombre) cliente
FROM MONEDA MO
JOIN CUENTA CU 
ON MO.chr_monecodigo = CU.chr_monecodigo
JOIN CLIENTE CL
ON CU.chr_cliecodigo = CL.chr_cliecodigo 
WHERE CU.chr_sucucodigo = '001'




