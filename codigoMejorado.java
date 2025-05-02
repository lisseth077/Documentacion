public class codigoMejorado {
    public static ArrayList<String> users = new ArrayList<>();
    
    public static boolean addUser(String u) {
        try {
            if (u != null && u.length() > 0) {
                // Verificar si el nombre de usuario ya existe
                if (users.contains(u)) {
                    System.out.println("Error: El usuario ya existe.");
                    return false;
                }
                users.add(u);
                System.out.println("Usuario agregado: " + u);
                return true;
            } else {
                System.out.println("Error: Nombre de usuario inválido.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            return false;
        }
    }

    public static void printUsers() {
        for (String user : users) {
            System.out.println(user);
        }
    }
}