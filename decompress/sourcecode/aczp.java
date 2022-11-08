import android.net.Uri;
import java.io.IOException;
import android.os.Parcelable;
import android.app.Activity;
import android.content.Intent;
import com.google.protos.youtube.api.innertube.StoriesShareCommandOuterClass$StoriesShareCommand;
import java.util.Map;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczp implements vau
{
    private static final String a;
    private final aeim b;
    private final aeim c;
    private final aeim d;
    
    static {
        a = trn.a("ShareStoriesCommand");
    }
    
    public aczp(final aeim b, final aeim c, final aeim d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private static final Bitmap b(final agyc agyc) {
        return BitmapFactory.decodeByteArray(agyc.I(), 0, agyc.d());
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final StoriesShareCommandOuterClass$StoriesShareCommand storiesShareCommandOuterClass$StoriesShareCommand = (StoriesShareCommandOuterClass$StoriesShareCommand)((agzd)aioe).rr((agyr)StoriesShareCommandOuterClass$StoriesShareCommand.storiesShareCommand);
        final Bitmap b = b(storiesShareCommandOuterClass$StoriesShareCommand.d);
        try {
            int bc;
            if ((bc = aqql.bc(storiesShareCommandOuterClass$StoriesShareCommand.e)) == 0) {
                bc = 1;
            }
            Label_0745: {
                if (--bc == 1) {
                    break Label_0745;
                }
                Label_0607: {
                    if (bc == 2) {
                        break Label_0607;
                    }
                    Label_0340: {
                        if (bc == 3) {
                            break Label_0340;
                        }
                        if (bc != 4) {
                            trn.c(aczp.a, "Unknown story share target.");
                            return;
                        }
                        final aeim d = this.d;
                        agyc b2;
                        if (storiesShareCommandOuterClass$StoriesShareCommand.b == 2) {
                            b2 = (agyc)storiesShareCommandOuterClass$StoriesShareCommand.c;
                        }
                        else {
                            b2 = agyc.b;
                        }
                        final Bitmap b3 = b(b2);
                        final String f = storiesShareCommandOuterClass$StoriesShareCommand.f;
                        final String g = storiesShareCommandOuterClass$StoriesShareCommand.g;
                        final Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
                        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", g);
                        intent.putExtra("content_url", f);
                        try {
                            final Uri f2 = adbp.f((Activity)d.b, adbp.g((Activity)d.b, b, "sticker.png"));
                            intent.putExtra("interactive_asset_uri", (Parcelable)f2);
                            intent.setType("image/*");
                            ((Activity)d.b).grantUriPermission("com.facebook.katana", f2, 1);
                            try {
                                intent.setDataAndType(adbp.f((Activity)d.b, adbp.g((Activity)d.b, b3, "background.png")), "image/*");
                                intent.setFlags(1);
                                if (((Activity)d.b).getPackageManager().resolveActivity(intent, 0) == null) {
                                    throw new Exception("Unable to resolve activity for Facebook story sharing.");
                                }
                                ((Activity)d.b).startActivityForResult(intent, 0);
                                final Object a = d.a;
                                if (a != null) {
                                    ((adfy)a).d("YTM_SHARE_TO_FACEBOOK_STORY");
                                }
                                return;
                            }
                            catch (final IOException ex) {
                                final Exception ex2 = new(java.lang.Exception.class)();
                                final Exception ex4;
                                final Exception ex3 = ex4 = ex2;
                                final String s = "Failed to create story background asset.";
                                final IOException ex5 = ex;
                                new Exception(s, ex5);
                                throw ex3;
                            }
                        }
                        catch (final IOException ex7) {
                            throw new Exception("Failed to create story sticker asset.", ex7);
                        }
                        try {
                            final Exception ex2 = new(java.lang.Exception.class)();
                            final Exception ex4;
                            final Exception ex3 = ex4 = ex2;
                            final String s = "Failed to create story background asset.";
                            final IOException ex;
                            final IOException ex5 = ex;
                            new Exception(s, ex5);
                            throw ex3;
                            try {
                                final aeim c = this.c;
                                agyc b4;
                                if (storiesShareCommandOuterClass$StoriesShareCommand.b == 2) {
                                    b4 = (agyc)storiesShareCommandOuterClass$StoriesShareCommand.c;
                                }
                                else {
                                    b4 = agyc.b;
                                }
                                final Bitmap b5 = b(b4);
                                final String f3 = storiesShareCommandOuterClass$StoriesShareCommand.f;
                                final Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
                                intent2.putExtra("source_application", ((Activity)c.b).getPackageName());
                                intent2.putExtra("content_url", f3);
                                try {
                                    final Uri f4 = adbp.f((Activity)c.b, adbp.g((Activity)c.b, b, "sticker.png"));
                                    intent2.putExtra("interactive_asset_uri", (Parcelable)f4);
                                    intent2.setType("image/*");
                                    ((Activity)c.b).grantUriPermission("com.instagram.android", f4, 1);
                                    try {
                                        intent2.setDataAndType(adbp.f((Activity)c.b, adbp.g((Activity)c.b, b5, "background.png")), "image/*");
                                        intent2.setFlags(1);
                                        if (((Activity)c.b).getPackageManager().resolveActivity(intent2, 0) != null) {
                                            ((Activity)c.b).startActivityForResult(intent2, 0);
                                            final Object a2 = c.a;
                                            if (a2 != null) {
                                                ((adfy)a2).d("YTM_SHARE_TO_INSTAGRAM_STORY");
                                            }
                                            return;
                                        }
                                        throw new Exception("Unable to resolve activity for Instagram story sharing.");
                                    }
                                    catch (final IOException ex8) {
                                        final Exception ex9 = new(java.lang.Exception.class)();
                                        final Exception ex11;
                                        final Exception ex10 = ex11 = ex9;
                                        final String s2 = "Failed to create story background asset.";
                                        final IOException ex12 = ex8;
                                        new Exception(s2, ex12);
                                        throw ex10;
                                    }
                                }
                                catch (final IOException ex14) {
                                    throw new Exception("Failed to create story sticker asset.", ex14);
                                }
                                try {
                                    final Exception ex9 = new(java.lang.Exception.class)();
                                    final Exception ex11;
                                    final Exception ex10 = ex11 = ex9;
                                    final String s2 = "Failed to create story background asset.";
                                    final IOException ex8;
                                    final IOException ex12 = ex8;
                                    new Exception(s2, ex12);
                                    throw ex10;
                                    try {
                                        final aeim b6 = this.b;
                                        agyc b7;
                                        if (storiesShareCommandOuterClass$StoriesShareCommand.b == 2) {
                                            b7 = (agyc)storiesShareCommandOuterClass$StoriesShareCommand.c;
                                        }
                                        else {
                                            b7 = agyc.b;
                                        }
                                        final Bitmap b8 = b(b7);
                                        final String f5 = storiesShareCommandOuterClass$StoriesShareCommand.f;
                                        final String g2 = storiesShareCommandOuterClass$StoriesShareCommand.g;
                                        final double n = storiesShareCommandOuterClass$StoriesShareCommand.h;
                                        final double n2 = storiesShareCommandOuterClass$StoriesShareCommand.i;
                                        final Intent s3 = aeim.s(g2, "snapchat://creativekit/preview/1", f5);
                                        b6.q(s3, b, n, n2);
                                        try {
                                            s3.putExtra("android.intent.extra.STREAM", (Parcelable)adbp.f((Activity)b6.b, adbp.g((Activity)b6.b, b8, "background")));
                                            b6.r(s3, "YTM_SHARE_TO_SNAPCHAT_PREVIEW");
                                            return;
                                        }
                                        catch (final IOException ex15) {
                                            throw new Exception("Failed to create story background asset.", ex15);
                                        }
                                        final aeim b9 = this.b;
                                        final String f6 = storiesShareCommandOuterClass$StoriesShareCommand.f;
                                        final String g3 = storiesShareCommandOuterClass$StoriesShareCommand.g;
                                        final double n3 = storiesShareCommandOuterClass$StoriesShareCommand.h;
                                        final double n4 = storiesShareCommandOuterClass$StoriesShareCommand.i;
                                        final Intent s4 = aeim.s(g3, "snapchat://creativekit/camera/1", f6);
                                        b9.q(s4, b, n3, n4);
                                        b9.r(s4, "SHARE_TO_SNAPCHAT_CAMERA");
                                    }
                                    catch (final Exception ex16) {
                                        trn.f(aczp.a, "Unable to create share intent.", (Throwable)ex16);
                                    }
                                }
                                catch (final Exception ex17) {}
                            }
                            catch (final Exception ex18) {}
                        }
                        catch (final Exception ex19) {}
                    }
                }
            }
        }
        catch (final Exception ex20) {}
    }
}
