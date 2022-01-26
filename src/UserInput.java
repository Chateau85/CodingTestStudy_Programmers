public class UserInput {

    public static class TextInput {
        StringBuilder sb;

        public TextInput() {
            sb = new StringBuilder();
        }

        public String getValue() {
            return sb.toString();
        }

        public void add(char c) {
            sb.append(c);
        }
    }

    public static class NumericInput extends TextInput {
        TextInput textInput;

        public NumericInput() {
            textInput = new TextInput();
        }

        @Override
        public void add(char c) {
            if ('0' <= c && c <= '9') {
                super.add(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        input.add('1');
        input.add('1');
        System.out.println(input.getValue());
    }
}