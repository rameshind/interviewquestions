import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


class Solution {
        public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
                static Map<String, List<Integer>> playerData = new ConcurrentHashMap<>();
                @Override
                public void putNewInnings(String player, int runs){
                        if(Objects.nonNull(playerData.get(player))){
                                List<Integer> innings= playerData.get(player);
                                innings.add(runs);
                                playerData.put(player, innings);
                        } else {
                                playerData.put(player, Arrays.asList(runs));
                        }

                }

                @Override
                public double getAverageRuns(String player){
                        if(Objects.nonNull(playerData.get(player))){
                                List<Integer> innings = playerData.get(player);
                                return innings.stream().reduce(0, Integer::sum)/innings.size();
                        }
                        return 0;
                }

                @Override
                public int getInningsCount(String player){
                        if(Objects.nonNull(playerData.get(player))){
                                return    playerData.get(player).size();

                        }
                        return  0;
                }
        }

        ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

        public interface PlayerStatisticsCollector {
                // This is an input. Make note of this player inning.  Runs is a non negative integer.
                void putNewInnings(String player, int runs);

                // Get the runs average(mathematical average) for a player
                double getAverageRuns(String player);

                // Get the total number of innings for the player
                int getInningsCount(String player);
        }

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int numLines = Integer.parseInt(scanner.nextLine());
                int currentLine = 0;
                while (currentLine++ < numLines) {
                        final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
                        final Set<String> players = new TreeSet<>();

                        String line = scanner.nextLine();
                        String[] inputs = line.split(",");
                        for (int i = 0; i < inputs.length; ++i) {
                                String[] tokens = inputs[i].split(" ");
                                final String player = tokens[0];
                                players.add(player);
                                final int runs = Integer.parseInt(tokens[1]);

                                stats.putNewInnings(player, runs);

                        }

                        for (String player : players) {
                                System.out.println(
                                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
                        }

                }
                scanner.close();

        }
}
