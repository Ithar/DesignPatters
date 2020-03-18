package malik.structural.facade.pattern;

public class SystemsFacade {

	SubSystemOne sysOne;
	SubSystemTwo sysTwo;
	SubSystemThree sysThree;
	
	public SystemsFacade(SubSystemOne sysOne, SubSystemTwo sysTwo, SubSystemThree sysThree) {
	  this.sysOne = sysOne;
	  this.sysTwo = sysTwo;
	  this.sysThree = sysThree;
  }

	public void runSystems() {
		
		sysOne.MethodOne();
		sysTwo.MethodTwo();
		sysThree.MethodThree();
	}
	
	
	
	
}
