//import Constant.Constant;
//import com.google.gson.Gson;
//import exception.ConnectionException;
//import exmaple.ChatContract;
//import org.junit.jupiter.api.*;
//import org.mockito.*;
//import model.ChatResponse;
//import requestobject.RequestFileMessage;
//
///**
// * Created By Khojasteh on 8/6/2019
// */
//
//@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//
//public class SendFileMessage implements ChatContract.view {
//    @Mock
//    static ChatContract.view chatContract;
//    @InjectMocks
//    static ChatController chatController = Mockito.mock(ChatController.class);
//
//    Gson gson = new Gson();
//
//    @BeforeEach
//    public void initMocks() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    @Order(1)
//    public void connect() throws InterruptedException {
//        try {
//            chatController = new ChatController(chatContract);
//
//            ChatConfig requestConnect = new ChatConfig
//                    .Builder(Constant.queueServer,
//                    Constant.queuePort,
//                    Constant.queueInput,
//                    Constant.queueOutput,
//                    Constant.queueUserName,
//                    Constant.queuePassword,
//                    Constant.serverName,
//                    Constant.token,
//                    Constant.ssoHost,
//                    Constant.platformHost,
//                    Constant.fileServer,
//                    Constant.chatId)
//                    .typeCode("default")
//                    .build();
//
//            chatController.connect(requestConnect);
//
//            Thread.sleep(2000);
//        } catch (ConnectionException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    @Order(2)
//    void sendImageFileMessage() throws InterruptedException {
//
//        RequestFileMessage requestFileMessage = new RequestFileMessage
//                .Builder(5461, "C:\\Users\\fanap-10\\Pictures\\Saved Pictures\\a.jpg")
//                .description("this is test image")
//                .xC(0)
//                .yC(0)
//                .hC(100)
//                .wC(200)
//                .build();
//
//
//        chatController.uploadFileMessage(requestFileMessage, null);
//
//        Thread.sleep(20000);
//
//        ArgumentCaptor<ChatResponse> argument = ArgumentCaptor.forClass(ChatResponse.class);
//
//        Mockito.verify(chatContract, Mockito.times(1)).onSentMessage(argument.capture());
//        Mockito.verify(chatContract, Mockito.times(1)).onNewMessage(argument.capture());
//
//    }
//
//
//    @Test
//    @Order(2)
//    void sendTextFileMessage() throws InterruptedException {
//
//        RequestFileMessage requestFileMessage = new RequestFileMessage
//                .Builder(5461, "F:\\models.txt")
//                .description("this is test image")
//                .build();
//
//        chatController.uploadFileMessage(requestFileMessage, null);
//
//
//        Thread.sleep(20000);
//
//        ArgumentCaptor<ChatResponse> argument = ArgumentCaptor.forClass(ChatResponse.class);
//
//        Mockito.verify(chatContract, Mockito.times(1)).onSentMessage(argument.capture());
//        Mockito.verify(chatContract, Mockito.times(1)).onNewMessage(argument.capture());
//    }
//
//
//}
