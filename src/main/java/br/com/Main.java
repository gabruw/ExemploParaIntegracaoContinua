package br.com;

import java.math.BigDecimal;
import java.util.Date;

public class Main {

    public static void main(final String[] arg) {

        Peca prod1 = new Peca();
        prod1.setId(1);
        prod1.setDescricao("Sabao em pó");
        
        Peca prod2 = new Peca();
        prod2.setId(2);
        prod2.setDescricao("Alcool em gel");
        
        
        Pedido px = new Pedido();
        
        px.criar(prod1, 300);
        px.criar(prod2, 200);
        
        px.destruir(prod2);
     
        
        
        //px.getItens().add(ip1);
        //px.adicionar(ip1);
        //ip1.setPedido(px);
        //px.getItens().get(0);
        //px.getItens().set(0, ip1);
        
        
        
        Tecnico t1 = new Tecnico();
        t1.setNome("a");
        t1.setId(1);

        Tecnico t2 = new Tecnico();
        t2.setNome("b");
        t2.setId(2);

        Tecnico t3 = new Tecnico();
        t3.setNome("c");
        t3.setId(3);

        Projeto p1 = new Projeto();
        p1.setId(-1);
        p1.setNome("d");

        Projeto p2 = new Projeto();
        p2.setId(-2);
        p2.setNome("e");

        Computador c1 = new Computador();
        c1.setId(100);
        c1.setModelo("x");

        Computador c2 = new Computador();
        c2.setId(200);
        c2.setModelo("y");

        Computador c3 = new Computador();
        c3.setId(300);
        c3.setModelo("z");

        Uso u1 = new Uso();
        u1.setId(500);
        u1.setTecnico(t1);
        u1.setProjeto(p2);
        u1.setComputador(c1);

        c1.add(u1);
        t1.add(u1);
        p2.add(u1);

        System.err.println(u1);

        Uso u2 = new Uso();
        u2.setId(600);
        u2.setTecnico(t1);
        u2.setProjeto(p1);
        u2.setComputador(c3);

        c3.add(u2);
        t1.add(u2);
        p1.add(u2);

        System.out.println(u2);

        Uso u3 = new Uso();
        u3.setId(700);
        u3.setTecnico(t3);
        u3.setProjeto(p2);
        u3.setComputador(c1);

        c1.add(u3);
        t3.add(u3);
        p2.add(u3);

        System.err.println(u3);

        Filho f1 = new Filho();
        f1.setId(900);
        f1.setNome("joao");
        f1.setTecnico(t1);

        t1.addFilho(f1);

        //   u3.getComputador().getModelo();
        //   u3.getProjeto().getVerba();
        System.err.println(c1.getUsos().get(0).getTecnico().getFilhos());

        for (Filho f : c1.getUsos().get(0).getTecnico().getFilhos()) {
            System.out.println(f);
        }

        //  for (Uso x : c2.getUsos()){
        //      System.out.println(x.getTecnico().getFilhos());
        //  }
        // c1.getUsos().get(1).getTecnico();
        //  System.err.println(c1.getUsos().size());
        //System.out.println("Oi");
        ClientePessoaFisica pf = new ClientePessoaFisica();
        pf.setCpf("03175333333");
        pf.setId(0);
        pf.setNome("a");

        Pedido p = new Pedido();
        p.setId(10);
        p.setData(new Date());
        p.setCliente(pf);

        System.out.println(p);

        Pessoa jose = new Pessoa();
        jose.setId(0L);
        jose.setNome("jose");
        jose.setCpf("113");

        Pessoa maria = new Pessoa();
        maria.setId(1L);
        maria.setNome("maria");
        maria.setCpf("114");

        maria.setCasamento(jose);
        jose.setCasamento(maria);

        System.out.println(jose);
        System.out.println("esta casado com:" + jose.getCasamento());

        System.out.println(maria);
        System.out.println("esta casado com:" + maria.getCasamento().getId());

        Peca comp = new Peca();
        comp.setId(0L);
        comp.setDescricao("Computador");

        Peca memoria = new Peca();
        memoria.setId(1L);
        memoria.setDescricao("Memoria");

        Peca calc = new Peca();
        calc.setId(2L);
        calc.setDescricao("Calculadora");

        Peca pm = new Peca();
        pm.setId(3L);
        pm.setDescricao("Placa Mae");

        comp.addComposto(pm);
        comp.addComposto(memoria);

        calc.addComposto(pm);

        System.out.println(comp);

        for (Peca i : comp.getCompostos()) {
            System.out.println("tem como composto essa peça :" + i.getDescricao());
        }
        
        System.out.println(memoria);
        for (Peca i : memoria.getCompostos()) {
            System.out.println("tem como composto essa peça :" + i.getDescricao());
        }
       
    }

    public static boolean validar() {
        return true;
    }
}
