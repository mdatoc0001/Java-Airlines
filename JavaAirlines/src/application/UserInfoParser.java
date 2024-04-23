package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserInfoParser {
    
	public List<UserInfo> readUserDataFromTXT(String filePath) throws IOException {
        List<UserInfo> userInfoList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                try {
                	UserInfo userInfo = new UserInfo(data);
                    userInfoList.add(userInfo);
                } catch (IllegalArgumentException e) {
                    System.err.println("Invalid user data: " + line);
                }
            }
        }

        return userInfoList;
    }
}