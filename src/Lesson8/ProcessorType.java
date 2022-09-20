package Lesson8;

public enum ProcessorType implements Describable {
	BIT_32("bit_32") {
//		@Override
//		public String getDescription() {
//			return "32-bit system";
//		}
	},
	BIT_64("bit_64") {
//		@Override
//		public String getDescription() {	//здесь необходимо переопределить все абстрактые методы
//			return "64-bit system";
//		}
	};

	private String name;

	public String getDescription() {	//вот так можно переопределить методы реализуемых интерфейсов
		return name + " system";
	}

	ProcessorType(String name) {
		this.name = name;
	}

//	public abstract String getDescription();	//можно создавать абстрактные методы в теле Enum,
												//реализовать их необходимо в теле каждого экземпляра класса

	public String getName() {
		return name;
	}
}
