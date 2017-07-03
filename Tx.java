Connection cn = null;
try {
  // Inicio de Tx
  cn = AccesoDB.getConnection();
  cn.setAutoCommit(false);
  
  
  // Confirmar TX
  cn.commit();
} catch (Exception e) {
  try {
	cn.rollback();
  } catch (Exception e1) {
  }
  throw new RuntimeException(e.getMessage());
} finally{
  try {
	cn.close();
  } catch (Exception e) {
  }
}