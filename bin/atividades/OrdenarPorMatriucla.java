
package atividades;

import java.util.Comparator;

public class OrdenarPorMatriucla implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
	return Double.compare(o1.getMatricula(), o2.getMatricula());
	}
	
}
