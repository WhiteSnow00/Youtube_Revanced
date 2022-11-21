import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiub extends ahcz implements aheo
{
    public static final aiub a;
    private static volatile ahev k;
    public int b;
    public String c;
    public ajws d;
    public String e;
    public boolean f;
    public ajws g;
    public int h;
    public aisc i;
    public boolean j;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aiub.class, a = new aiub());
    }
    
    private aiub() {
        this.l = 2;
        this.c = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = aiub.k) == null) {
                    synchronized (aiub.class) {
                        if (aiub.k == null) {
                            aiub.k = (ahev)new ahcs((ahcz)aiub.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aiub.a;
            }
            case 4: {
                return new ahcr((ahcz)aiub.a);
            }
            case 3: {
                return new aiub();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiub.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1008\u0002\u0003\u1409\u0001\u0004\u1007\u0003\u0005\u1409\u0004\u0006\u1004\u0005\u0007\u1409\u0006\b\u1007\u0007", new Object[] { "b", "c", "e", "d", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
