import android.util.Log;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqy implements afsz
{
    private final /* synthetic */ int a;
    
    public gqy(final int a) {
        this.a = a;
    }
    
    public final void rz(final Throwable t) {
        switch (this.a) {
            default: {
                if (!(t instanceof pyd)) {
                    Log.w("OneGoogle", "Failed to load owner avatar", t);
                    return;
                }
                break;
            }
            case 9: {
                Log.w("OneGoogle", "Failed to grant account access to app", t);
                return;
            }
            case 8: {
                ((afjf)((afjf)((afjf)((afig)pbr.a).g()).i(t)).j("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "lambda$provideEventResultHandler$1", 24, "FloggerResultDaggerModule.java")).p();
                return;
            }
            case 7: {
                c.i(((afig)oce.a).d(), "IPC call to broadcast stat sample failed.", "com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$5", "onFailure", '\u0281', "MeetIpcManagerImpl.java", t);
                return;
            }
            case 6: {
                c.i(((afig)oce.a).d(), "IPC call for disconnectMeeting failed.", "com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$3", "onFailure", '\u015c', "MeetIpcManagerImpl.java", t);
                return;
            }
            case 5: {
                c.i(((afig)oce.a).d(), "IPC call for connectMeeting failed.", "com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$2", "onFailure", '\u0112', "MeetIpcManagerImpl.java", t);
                return;
            }
            case 4: {
                c.i(((afig)oce.a).d(), "IPC call for connectMeetingAsStream failed.", "com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$1", "onFailure", '\u00ef', "MeetIpcManagerImpl.java", t);
                return;
            }
            case 3: {
                c.i(((afig)nyu.a).g(), "Failed to close future closeable.", "com/google/android/libraries/ar/faceviewer/utils/FutureHelper$1", "onFailure", '\u001f', "FutureHelper.java", t);
                return;
            }
            case 2: {
                c.i(((afig)nwo.a).g(), "Failed to create cronet engine.", "com/google/android/libraries/ar/faceviewer/FaceViewerManager$2", "onFailure", '\u00ef', "FaceViewerManager.java", t);
                return;
            }
            case 1: {
                c.i(((afig)gqu.a).h().h(afjj.a, (Object)"AQCResolver"), "Request was not successfully adapted and sent", "com/google/android/apps/youtube/app/extensions/assistant/connection/AssistantQueryCommandResolver$1", "onFailure", 'D', "AssistantQueryCommandResolver.java", t);
                return;
            }
            case 0: {
                c.i(((afig)gqz.a).h().h(afjj.a, (Object)"AQCResolver"), "Request was not successfully sent", "com/google/android/apps/youtube/app/extensions/assistant/connection/classic/AssistantConnectionCallback$1", "onFailure", 'S', "AssistantConnectionCallback.java", t);
                break;
            }
        }
    }
}
