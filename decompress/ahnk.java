import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnk extends ahcz implements aheo
{
    public static final ahnk a;
    private static volatile ahev d;
    public ahnl b;
    public int c;
    private int e;
    private ahpb f;
    private ahjl g;
    private ahoi h;
    private anxb i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(ahnk.class, a = new ahnk());
    }
    
    private ahnk() {
        this.j = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = ahnk.d) == null) {
                    synchronized (ahnk.class) {
                        if (ahnk.d == null) {
                            ahnk.d = (ahev)new ahcs((ahcz)ahnk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahnk.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnk.a);
            }
            case 3: {
                return new ahnk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnk.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005\b\u1409\b", new Object[] { "e", "b", "c", "f", "g", "h", "i" });
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
