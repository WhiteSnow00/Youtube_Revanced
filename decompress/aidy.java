import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidy extends ahcz implements aheo
{
    public static final aidy a;
    private static volatile ahev i;
    public int b;
    public int c;
    public Object d;
    public ahdp e;
    public anxb f;
    public anxb g;
    public ahbt h;
    private ahpb j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aidy.class, a = new aidy());
    }
    
    private aidy() {
        this.c = 0;
        this.l = 2;
        emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.h = ahbt.b;
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
                final ahev i;
                if ((i = aidy.i) == null) {
                    synchronized (aidy.class) {
                        if (aidy.i == null) {
                            aidy.i = (ahev)new ahcs((ahcz)aidy.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aidy.a;
            }
            case 4: {
                return new ahcr((ahcz)aidy.a);
            }
            case 3: {
                return new aidy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidy.a, "\u0001\b\u0001\u0001\u0007\u0014\b\u0000\u0001\u0007\u0007\u1409\u0007\b\u143c\u0000\n\u041b\r\u1409\f\u000e\u1409\r\u000f\u1409\u000e\u0010\u100a\u000f\u0014\u143c\u0000", new Object[] { "d", "c", "b", "j", ahpb.class, "e", aisc.class, "f", "g", "k", "h", anxb.class });
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
