package Service;

import Entities.ChatRoom;
import Entities.Message;
import Repositories.ChatRoomRepository;
import Repositories.MessageRepository;
import Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    public List<Message> getMessages(Long chatRoomId) {
        return messageRepository.findByChatRoomId(chatRoomId);
    }
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }
}
