<h3>Análise de complexidade dos Algoritmos</h3>
<table>
    <thead>
        <th>Algoritmo</th>
        <th>Pior caso</th>
        <th>Melhor caso</th>
    </thead>
    <tbody>
        <tr>
            <td>Selection sort</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
        </tr>
        <tr>
            <td>Bubble sort</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n)</td>
        </tr>
        <tr>
            <td>Insert sort</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n)</td>
        </tr>
        <tr>
            <td>Merge sort*</td>
            <td>O(nlog(n)</td>
            <td>O(nlog(n)</td>
        </tr>
        <tr>
            <td>Quick sort</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(nlog(n)</td>
        </tr>
    </tbody>
</table>
<p>*<i>O algoritmo de merge sort é o mais estável comparado aos demais</i></p>
<p>Arrays.sort usa dual-pivô QuickSort em tipos primitivos</p>
<p>Para coleções, sort, usa uma modificação do merge sort (Tim Sort)</p>
<p>Tim Sort é um algoritmo híbrido que usa merge sort e insertion sort, atualmente é default em linguagens como <b>Java</b> e <b>Python</b></p>
<h3>Hash Map</h3>
<p>Hash Map é uma estrutura de dados que permite realizar buscas com eficiência e de tempo constante</p>
<p>Esta estrutura usa o método hashCode() de keys para devolver os valores de forma mais eficiente</p>


<h3>Detalhamento das complexidades</h3>

<p><i><u>Selection Sort</u></i></p>
<p>Pior caso</p>
<p> - Buscar o menor elemento na primeira iteração custa (n - 1) passos, na segunda iteração custa (n - 2) e assim por diante. A soma de termos de uma PA</p>

<p><i><u>Bubble Sort</u></i></p>
<p>Pior caso</p>
<p> - O pior caso irá acontecer quando o vetor está ordenado de forma decrescente</p>
<p>Melhor caso</p>
<p> - Ocorre quando o vetor está ordenado </p>

<p><i><u>Quick Sort</u></i></p>
<p>Pior caso</p>
<p> - O pior caso irá acontecer quando o pivô dividi o array em tamanhos diferentes, 0 e (n - 1) elementos</p>
<p>Melhor caso</p>
<p> - O melhor caso acontece quando as partições têm sempre o mesmo tamanho</p>

