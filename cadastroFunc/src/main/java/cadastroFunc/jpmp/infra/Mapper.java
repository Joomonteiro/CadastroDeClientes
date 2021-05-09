package cadastroFunc.jpmp.infra;

public interface Mapper<S, T> {
	
	T map(S source);

}
