package tipoPilha;

public class TipoPilhaInt {

	public final int N = 166;
	int[] dados = new int[N];
	int topo;
	public int length = N;

	public void init() {
		topo = 0;
	}

	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}

	public int top() {
		return dados[topo - 1];
	}

	public void clear() {
		while (!isEmpty()) {
			System.out.println(pop());
		}
	}

	public void all() {
		for (int i = 0; i < N; i++) {
			System.out.println(dados[i]);
		}
	}

	public void push(int elem) {
		if (isFull() == false) {
			dados[topo] = elem;
			topo++;
		} else
			System.out.println("Stack Overflow");
	}

	public int pop() {
		topo--;
		return (dados[topo]);
	}
}
