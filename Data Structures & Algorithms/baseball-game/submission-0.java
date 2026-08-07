class Solution {

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String item : operations) {

            if (item.equals("C")) {
                stack.pop();
            } 
            else if (item.equals("D")) {
                stack.push(stack.peek() * 2);
            } 
            else if (item.equals("+")) {
                int first = stack.pop();
                int second = stack.peek();

                stack.push(first);
                stack.push(first + second);
            } 
            else {
                stack.push(Integer.parseInt(item));
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}