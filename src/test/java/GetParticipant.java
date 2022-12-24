//import Constant.Constant;
//import com.google.gson.Gson;
//import exception.ConnectionException;
//import exmaple.ChatContract;
//import exmaple.ChatController;
//import org.junit.jupiter.api.*;
//import org.mockito.*;
//import podAsync.AsyncConfig;
//import podChat.model.ChatResponse;
//import podChat.requestobject.RequestThreadParticipant;
//import podChat.util.ChatConfig;
//
///**
// * Created By Khojasteh on 8/6/2019
// */
//
//@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//
//public class GetParticipant implements ChatContract.view {
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
//            AsyncConfig asyncConfig = AsyncConfig.builder()
//                    .isSocketProvider(true)
//                    .socketAddress(Constant.socketAddress)
//                    .serverName(Constant.serverName)
//                    .queuePassword(Constant.queuePassword)
//                    .queueUserName(Constant.queueUserName)
//                    .queueInput(Constant.queueInput)
//                    .queueOutput(Constant.queueOutput)
//                    .queueServer(Constant.queueServer)
//                    .queuePort(Constant.queuePort)
//                    .isLoggable(true)
//                    .build();
//            ChatConfig chatConfig = ChatConfig.builder()
//                    .asyncConfig(asyncConfig)
//                    .severName(Constant.serverName)
//                    .token(Constant.token)
//                    .chatId(Constant.chatId)
//                    .fileServer(Constant.fileServer)
//                    .ssoHost(Constant.ssoHost)
//                    .platformHost(Constant.platformHost)
//                    .build();
//            chatController = new ChatController(this, chatConfig);
//            chatController.connect();
//
//            Thread.sleep(2000);
//        } catch (ConnectionException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    @Order(2)
//    void getGroupParticipant() throws InterruptedException {
//
//        RequestThreadParticipant requestThreadParticipant = new RequestThreadParticipant
//                .Builder(5781)
//                .count(5)
//                .offset(0)
//                .build();
//
//        chatController.getThreadParticipant(requestThreadParticipant);
//
//        Thread.sleep(5000);
//
//        ArgumentCaptor<ChatResponse> argument = ArgumentCaptor.forClass(ChatResponse.class);
//
//        Mockito.verify(chatContract).onGetThreadParticipant(argument.capture());
//
//        ChatResponse chatResponse = argument.getValue();
//
//        Assertions.assertTrue(!chatResponse.hasError());
//    }
//
//    @Test
//    @Order(2)
//    void getParticipant() throws InterruptedException {
//
//        RequestThreadParticipant requestThreadParticipant = new RequestThreadParticipant
//                .Builder(5461)
//                .build();
//
//        chatController.getThreadParticipant(requestThreadParticipant);
//
//        Thread.sleep(5000);
//
//        ArgumentCaptor<ChatResponse> argument = ArgumentCaptor.forClass(ChatResponse.class);
//
//        Mockito.verify(chatContract).onGetThreadParticipant(argument.capture());
//
//        ChatResponse chatResponse = argument.getValue();
//
//        Assertions.assertTrue(!chatResponse.hasError());
//    }
//
//
//}
