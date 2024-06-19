public class Lutador {
     String nome;
     String nacionalidade;
     int idade;
     float altura;
     float peso;
     String categoria;
     int vitorias;
     int derrotas;
     int empates;
 
     
     
     //----------------
     
     public Lutador(String nome, String nacionalidade,int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
         this.nome = nome;
         this.nacionalidade = nacionalidade;
         this.idade = idade;
         this.altura = altura;
         this.setPeso(peso);
         this.vitorias = vitorias;
         this.derrotas = derrotas;
         this.empates = empates;
     }
     
     //----------------
     
     void apresentar()
     {
         System.out.println("Esse lutador " + getNome());
         System.out.println("Com " + getVitorias() + "vitorias");
         System.out.println("com origem " + getNacionalidade());
         System.out.println("com categoria" + getCategoria() + "\n");
     }
     
     void status() 
     {
        System.out.println("Categoria " + getCategoria() );
        System.out.println("vitorias " + getVitorias());
        System.out.println("empates " + getEmpates());
        System.out.println("derrotas " + getDerrotas() + "\n");
     }
     
     void ganharLuta() 
     {
         setVitorias(getVitorias() + 1);
         
     }
     void empatarLuta() 
     {
         setEmpates(getEmpates() + 1);
         
     }
     void perderLuta() 
     {
         setDerrotas(getDerrotas() + 1);
        
     }
     
     
     
     
     //----------------
 
     public String getNome() {
         return nome;
     }
 
     public void setNome(String nome) {
         this.nome = nome;
     }
 
     public String getNacionalidade() {
         return nacionalidade;
     }
 
     public void setNacionalidade(String nacionalidade) {
         this.nacionalidade = nacionalidade;
     }
 
     public int getIdade() {
         return idade;
     }
 
     public void setIdade(int  idade) {
         this.idade = idade;
     }
 
     public float getAltura() {
         return altura;
     }
 
     public void setAltura(float altura) {
         this.altura = altura;
     }
 
     public float getPeso() {
         return peso;
     }
 
     public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
     }
 
     public String getCategoria() {
        
        return this.categoria;
     }
 
     public void setCategoria() {
         if(getPeso() < 52.2) 
         {
            this.categoria = "invalido";
         } else if (getPeso() <= 70.3) 
         {
            this.categoria = "Leve";
         } else if (getPeso() <= 83.9) 
         {
            this.categoria = "Medio";
         } else if (getPeso() < 120.2) {
            this.categoria = "Pesado";
         } else {
            this.categoria = "invalido";
         }
     }
 
     public int getVitorias() {
         return vitorias;
     }
 
     public void setVitorias(int vitorias) {
         this.vitorias = vitorias;
     }
 
     public int getDerrotas() {
         return derrotas;
     }
 
     public void setDerrotas(int derrotas) {
         this.derrotas = derrotas;
     }
 
     public int getEmpates() {
         return empates;
     }
 
     public void setEmpates(int empates) {
         this.empates = empates;
     }
     
     
     
 }
 