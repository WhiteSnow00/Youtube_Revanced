import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajic extends ahcz implements aheo
{
    public static final ajic a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public aqif d;
    public ajhz e;
    public ajid f;
    public String g;
    public ajhx h;
    public ajia i;
    private CommandOuterClass$Command k;
    private aqhc l;
    private ahjl m;
    private byte n;
    
    static {
        final ajic a2 = new ajic();
        ahcz.registerDefaultInstance(ajic.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 355246692, ahgc.k, ajic.class);
    }
    
    private ajic() {
        this.n = 2;
        emptyProtobufList();
        emptyProtobufList();
        this.g = "";
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = ajic.j) == null) {
                    synchronized (ajic.class) {
                        if (ajic.j == null) {
                            ajic.j = (ahev)new ahcs((ahcz)ajic.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajic.a;
            }
            case 4: {
                return new ahcr((ahcz)ajic.a);
            }
            case 3: {
                return new ajic();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajic.a, "\u0001\t\u0000\u0001\u0003%\t\u0000\u0000\u0004\u0003\u1008\u0012\u0006\u1409\u0007\u000f\u1009\u000b\u0011\u1009\u0011\u0018\u1409\n \u1009\f#\u1009\u001d$\u1409\u001e%\u1409\u001f", new Object[] { "c", "g", "k", "e", "f", "d", "l", "h", "i", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
