import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeju extends ahcz implements aheo
{
    public static final aeju a;
    private static volatile ahev f;
    public ahdp b;
    public ahdp c;
    public ahdp d;
    public ahdp e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aeju.class, a = new aeju());
    }
    
    private aeju() {
        this.g = 2;
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aeju.f) == null) {
                    synchronized (aeju.class) {
                        if (aeju.f == null) {
                            aeju.f = (ahev)new ahcs((ahcz)aeju.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aeju.a;
            }
            case 4: {
                return new ahcr((ahcz)aeju.a);
            }
            case 3: {
                return new aeju();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aeju.a, "\u0001\u0004\u0000\u0000\u00032\u0004\u0000\u0004\u0000\u0003\u001b\u0004\u001b0\u001b2\u001b", new Object[] { "c", aejt.class, "d", aejx.class, "b", aejy.class, "e", aejs.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
