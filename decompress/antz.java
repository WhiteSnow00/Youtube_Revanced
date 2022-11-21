import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antz extends ahcu implements ahcv
{
    public static final antz a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private anxb h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(antz.class, (ahcz)(a = new antz()));
    }
    
    private antz() {
        this.j = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = antz.b) == null) {
                    synchronized (antz.class) {
                        if (antz.b == null) {
                            antz.b = (ahev)new ahcs((ahcz)antz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return antz.a;
            }
            case 4: {
                return new ahct((ahcu)antz.a);
            }
            case 3: {
                return new antz();
            }
            case 2: {
                return newMessageInfo((MessageLite)antz.a, "\u0001\u0006\u0000\u0001\u0003\r\u0006\u0000\u0000\u0006\u0003\u1409\u0005\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1409\b\t\u1409\t\r\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
