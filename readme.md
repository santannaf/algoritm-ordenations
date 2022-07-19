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

