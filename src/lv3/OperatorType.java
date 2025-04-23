package lv3;

    public enum OperatorType {
        SUM('+'),
        SUB('-'),
        MUL('*'),
        DIV('/');

        private final char operator;

        OperatorType(char operator) {
            this.operator = operator;
        }

        public static OperatorType fromChar(char c) {
            for (OperatorType type : OperatorType.values()) {
                if (type.operator == c) {
                    return type;
                }
            }
            throw new IllegalArgumentException("+, -, *, / 중 한 개만 입력해주세요.");
        }





    }

