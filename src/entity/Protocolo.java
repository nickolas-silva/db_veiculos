package entity;

public class Protocolo {
  public static Servidor s = new Servidor();
  
  public Protocolo(){
    
    
  }

  public void inserirVeiculosPadrao(){
    s.addVeiculo(1, new Veiculo("ABC-1234", "SwiftSport", 2020, "12345678901", "João Silva", "98765432101"));
    s.addVeiculo(1, new Veiculo("XYZ-5678", "Mustang GT", 2022, "23456789012", "Maria Santos", "87654321012"));
    s.addVeiculo(1, new Veiculo("DEF-9012", "Civic Touring", 2019, "34567890123", "Pedro Oliveira", "76543210923"));
    s.addVeiculo(1, new Veiculo("GHI-3456", "Corolla XLE", 2021, "45678901234", "Ana Rodrigues", "65432109834"));
    s.addVeiculo(1, new Veiculo("JKL-7890", "Range Rover Evoque", 2023, "56789012345", "Rafael Almeida", "54321098745"));
    s.addVeiculo(1, new Veiculo("MNO-2345", "Wrangler Sahara", 2020, "67890123456", "Julia Carvalho", "43210987656"));
    s.addVeiculo(1, new Veiculo("PQR-6789", "A4 Quattro", 2022, "78901234567", "Lucas Ferreira", "32109876567"));
    s.addVeiculo(1, new Veiculo("STU-0123", "Camry SE", 2018, "89012345678", "Carolina Lima", "21098765478"));
    s.addVeiculo(1, new Veiculo("VWX-4567", "Model 3", 2021, "90123456789", "Gabriel Martins", "10987654389"));
    s.addVeiculo(1, new Veiculo("YZA-8901", "Prius Hybrid", 2019, "01234567890", "Isabela Sousa", "09876543290"));
    s.addVeiculo(1, new Veiculo("BCD-2345", "Focus Titanium", 2020, "12345678901", "Matheus Santos", "98765432101"));
    s.addVeiculo(1, new Veiculo("EFG-5678", "Grand Cherokee", 2022, "23456789012", "Larissa Oliveira", "87654321012"));
    s.addVeiculo(1, new Veiculo("HIJ-9012", "Accord EX", 2018, "34567890123", "Ricardo Rodrigues", "76543210923"));
    s.addVeiculo(1, new Veiculo("KLM-3456", "A3 Sportback", 2021, "45678901234", "Amanda Almeida", "65432109834"));
    s.addVeiculo(1, new Veiculo("NOP-7890", "X5 M", 2023, "56789012345", "André Carvalho", "54321098745"));
    s.addVeiculo(1, new Veiculo("QRS-2345", "CR-V LX", 2019, "67890123456", "Sophia Ferreira", "43210987656"));
    s.addVeiculo(1, new Veiculo("TUV-6789", "C-Class", 2020, "78901234567", "Enzo Lima", "32109876567"));
    s.addVeiculo(1, new Veiculo("WXY-0123", "911 Carrera", 2022, "89012345678", "Valentina Martins", "21098765478"));
    s.addVeiculo(1, new Veiculo("ZAB-4567", "Fusion SE", 2017, "90123456789", "Mateus Sousa", "10987654389"));
    s.addVeiculo(1, new Veiculo("CDE-8901", "Outlander PHEV", 2021, "01234567890", "Mariana Santos", "09876543290"));
    s.addVeiculo(1, new Veiculo("FGH-2345", "Veloster N", 2020, "12345678901", "Guilherme Oliveira", "98765432101"));
    s.addVeiculo(1, new Veiculo("IJK-5678", "X1 sDrive", 2023, "23456789012", "Laura Rodrigues", "87654321012"));
    s.addVeiculo(1, new Veiculo("LMN-9012", "Impreza WRX", 2019, "34567890123", "Thiago Almeida", "76543210923"));
    s.addVeiculo(1, new Veiculo("OPQ-3456", "GLE 450", 2022, "45678901234", "Fernanda Carvalho", "65432109834"));
    s.addVeiculo(1, new Veiculo("RST-7890", "3 Series", 2018, "56789012345", "Vinícius Ferreira", "54321098745"));
    s.addVeiculo(1, new Veiculo("TUV-2345", "A6 Premium", 2021, "67890123456", "Isadora Lima", "43210987656"));
    s.addVeiculo(1, new Veiculo("WXY-6789", "Escalade ESV", 2020, "78901234567", "Gustavo Martins", "32109876567"));
    s.addVeiculo(1, new Veiculo("ZAB-0123", "Tiguan R-Line", 2023, "89012345678", "Lorena Sousa", "21098765478"));
    s.addVeiculo(1, new Veiculo("CDE-4567", "Forte GT", 2017, "90123456789", "Raul Santos", "10987654389"));
    s.addVeiculo(1, new Veiculo("FGH-8901", "S60 T5", 2021, "01234567890", "Mariana Oliveira", "09876543290"));
    s.addVeiculo(1, new Veiculo("IJK-2345", "Challenger SRT", 2020, "12345678901", "Bruno Rodrigues", "98765432101"));
    s.addVeiculo(1, new Veiculo("LMN-5678", "M4 Competition", 2022, "23456789012", "Carla Almeida", "87654321012"));
    s.addVeiculo(1, new Veiculo("OPQ-9012", "RX 350", 2019, "34567890123", "Leonardo Carvalho", "76543210923"));
    s.addVeiculo(1, new Veiculo("RST-3456", "X6 xDrive", 2022, "45678901234", "Vitória Ferreira", "65432109834"));
    s.addVeiculo(1, new Veiculo("TUV-7890", "Model Y", 2021, "56789012345", "Diego Lima", "54321098745"));
    s.addVeiculo(1, new Veiculo("WXY-2345", "Civic Si", 2020, "67890123456", "Natália Martins", "43210987656"));
    s.addVeiculo(1, new Veiculo("ZAB-6789", "G-Wagon G550", 2023, "78901234567", "Eduardo Sousa", "32109876567"));
    s.addVeiculo(1, new Veiculo("CDE-0123", "Kona Electric", 2018, "89012345678", "Sophie Santos", "21098765478"));
    s.addVeiculo(1, new Veiculo("FGH-4567", "Optima LX", 2021, "90123456789", "Rafaela Oliveira", "10987654389"));
    s.addVeiculo(1, new Veiculo("IJK-8901", "Panamera", 2020, "01234567890", "Fábio Rodrigues", "09876543290"));
    s.addVeiculo(1, new Veiculo("LMN-2345", "X3 M", 2022, "12345678901", "Luana Almeida", "98765432101"));
    s.addVeiculo(1, new Veiculo("OPQ-5678", "A7 Prestige", 2019, "23456789012", "Marcos Carvalho", "87654321012"));
    s.addVeiculo(1, new Veiculo("RST-9012", "Avalon Limited", 2022, "34567890123", "Júlia Ferreira", "76543210923"));
    s.addVeiculo(1, new Veiculo("TUV-3456", "Mustang Mach-E", 2021, "45678901234", "Joana Lima", "65432109834"));
    s.addVeiculo(1, new Veiculo("WXY-7890", "4 Series Gran Coupe", 2020, "56789012345", "Pedro Martins", "54321098745"));
    s.addVeiculo(1, new Veiculo("ZAB-2345", "XC90 T6", 2018, "67890123456", "Lívia Sousa", "43210987656"));
    s.addVeiculo(47, new Veiculo("CDE-6789", "Q3", 2021, "78901234567", "Alexandre Carvalho", "32109876567"));
    s.addVeiculo(48, new Veiculo("FGH-0123", "Charger R/T", 2020, "89012345678", "Catarina Oliveira", "21098765478"));
    s.addVeiculo(49, new Veiculo("IJK-4567", "Sorento SX", 2023, "90123456789", "Roberto Rodrigues", "10987654389"));
    s.addVeiculo(50, new Veiculo("LMN-8901", "Elantra Limited", 2019, "01234567890", "Aline Almeida", "09876543290"));
  }

  public void inserirVeiculo(Integer k, Veiculo v){
    s.addVeiculo(k, new Veiculo("WXY-7890", "4 Series Gran Coupe", 2020, "56789012345", "Pedro Martins","54321098745"));
  }

  public void deletarVeiculo(){

  }

  public void editarVeiculo(){

  }

  public void buscarVeiculo(){

  }

  public void listar(){
    s.exibirVeiculos();
  }
}
