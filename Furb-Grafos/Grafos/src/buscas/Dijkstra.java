package buscas;

import grafos.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Djonathan
 */
public class Dijkstra 
{
    private static final int INFINITO = Integer.MAX_VALUE;
    private List<Vertice> s = new ArrayList();
    private List<Vertice> q = new ArrayList();
    
    /**
     * Inicializa o grafo para aplicar o dijkstra.
     * Seta para cada vértice: seta a distância inicial como infinito, o status para aberto
     * add o vérice em q e seta o pai para null.
     * @param origem - Vértice de origem
     * @param grafo - Grafo onde o algoritmo será aplicado

     * Pseudo-código:
        INITIALIZE-SINGLE-SOURCE(G,s)
        01. for each vertex v ∈ V[G]  
        02.     do d[v] ←∞
        03.        ∏[v] ← NIL 
        04. d[s] ← 0
    */
    private void initialize(Grafo grafo, Vertice origem)
    {
        for(Vertice vertice : grafo.getVertices())
        {
            vertice.setDistancia(INFINITO);
            vertice.setStatus("ABERTO");
            vertice.setPai(null);
            q.add(vertice);
        }

        origem.setDistancia(0);
    }
    
    /**
     * Verifica a menor distância entre os vértices do grafo
     * @param origem - vértice de origem
     * @param grafo - grafo onde o algoritmo será aplicado
     
     * Pseudo-código:
        DIJKSTRA(G, s)
        01. INITIALIZE-SINGLE-SOURCE(G,s) 
        02. S ←∅
        03. Q ← V[G] 
        04. while Q ≠∅
        05.    do u ← EXTRACT-MIN(Q) 
        06.        S ← S ∪ [u] 
        07.        for each vertex v ∈ Adj[u] 
        08.             do RELAX(u,v) 
     */
    public void dijkstra(Grafo grafo, Vertice origem)
    {
        // Inicializa o grafo para aplicar o algoritmo
        initialize(grafo, origem);
        
        while(!q.isEmpty())
        {
            // Pega o vértice não explorado com menor distância
            Vertice u = extractMin(q);
            
            // Seta o vértice na lista dos explorados e altera o status dele
            s.add(u);
            u.setStatus("EXPLORADO");
            
            // Remove o vértive u da lista de não explorados
            q.remove(u);
            
            // Relaxa cada vértice não explorado adjacente a v
            for(Vertice v : u.getAdjacentes())
                if(!v.getStatus().equals("EXPLORADO"))
                    relax(u, v);
        }
    }
    
    /**
     * Faz o relaxamento dos vértices
     * @param u - vértice com menor distância sendo processado
     * @param v - vértice adjacente a u
     
     * Pseudo-código
        RELAX(u, v)
        01. if d[v] > d[u] + w(u,v) 
        02.     then d[v] ← d[u] + w(u,v)  
        03.          ∏[v] ← u
     */
    private void relax(Vertice u, Vertice v)
    {
        Aresta arestaUV = u.getArestaPorVertices(v);
        float wuv = arestaUV.getValor();
        
        System.out.println("d(" + v.getRotulo() +"): " + v.getDistancia());
        System.out.println("d("+ u.getRotulo() + "): " + u.getDistancia());
        System.out.println("w("+ u.getRotulo() + "," + v.getRotulo() + "): " + wuv + "");
        
        // Se a distância do vérice adjacente for maior do que a distância de u + o vértice que leva até v
        if(v.getDistancia() > (u.getDistancia() + wuv))
        {
            System.out.println("Seta pai de " + v.getRotulo() + " = " + u.getRotulo());
            System.out.println("Distancia " + u.getRotulo() + "->" + v.getRotulo() + " = " + wuv);
            v.setDistancia(u.getDistancia() + wuv);
            v.setPai(u);
        }
        System.out.println("ACABO O RELAX MANO DE " + v.getRotulo() + " \n");
    }
    
    /**
     * Utiliza stream na lista q para verificar qual o vértice com menor distância
     * @param q - lista de vértices não fechados
     * @return Vértice não explorado com menor distância
     */
    private Vertice extractMin(List<Vertice> q)
    {
        System.out.println("MIN: " + Collections.min(q).getRotulo());
        return Collections.min(q);
    }

    

}