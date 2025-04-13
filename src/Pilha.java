package model;

public class Pilha {

		No topo;
		
		public Pilha() {
			topo = null;
		}
		
		public boolean isEmpty() {
			if (topo == null) {
				return true;
			} else {
				return false;
			}
		}
		
		public void push(int e) {
			No elemento = new No();
			elemento.dado = e;
			if(isEmpty()) {
				topo = elemento;
			} else {
				elemento.proximo = topo;
				topo = elemento;
			}
		}
		
        public int pop() throws Exception {
        	if (isEmpty()) {
        		throw new Exception("Não há elementos para desempilhar");
        	}
        	int valor = topo.dado;
        	topo = topo.proximo;
        	return valor;
        }
	}

