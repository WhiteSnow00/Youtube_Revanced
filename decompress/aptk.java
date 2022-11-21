import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptk extends ahcz implements aheo
{
    public static final aptk a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public aisc d;
    public ajws e;
    private ajws g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aptk.class, a = new aptk());
    }
    
    private aptk() {
        this.i = 2;
        this.c = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aptk.f) == null) {
                    synchronized (aptk.class) {
                        if (aptk.f == null) {
                            aptk.f = (ahev)new ahcs((ahcz)aptk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aptk.a;
            }
            case 4: {
                return new ahcr((ahcz)aptk.a);
            }
            case 3: {
                return new aptk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptk.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "b", "g", "c", apti.class, "d", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
