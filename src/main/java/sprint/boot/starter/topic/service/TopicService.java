package sprint.boot.starter.topic.service;

import org.springframework.stereotype.Service;
import sprint.boot.starter.topic.model.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    // Business Service in Spring is a Singleton class


    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "spring", "description"),
            new Topic("2", "java", "description"),
            new Topic("3", "javaScript", "description"),
            new Topic("4", "Kotlin", "description"),
            new Topic("5", "Groovy", "description")));


    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {

        /*for (int index = 0; index < topics.size(); index++) {
            if (topics.get(index).getId().equals(id)) {
                topics.set(index, topic);
                break;
            }
        }*/
        Topic tempTopic = topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        if (tempTopic != null) {
            tempTopic.setDescription(topic.getDescription());
            tempTopic.setName(topic.getName());
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
