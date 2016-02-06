import java.util.*;


public class SecurityLvl {
final public static SecurityLvl LOW = new SecurityLvl(0);
final public static SecurityLvl HIGH = new SecurityLvl(1);
int level = 0;

public SecurityLvl(int level){
	this.level = level;
}
}
