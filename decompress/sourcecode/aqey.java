import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqey extends agzi implements ahax
{
    public static final aqey a;
    private static volatile ahbe f;
    public int b;
    public agyc c;
    public SenderStateOuterClass$SenderState d;
    public aqex e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aqey.class, (agzi)(a = new aqey()));
    }
    
    private aqey() {
        this.g = 2;
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aqey.f) == null) {
                    synchronized (aqey.class) {
                        if (aqey.f == null) {
                            aqey.f = (ahbe)new agzb((agzi)aqey.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqey.a;
            }
            case 4: {
                return new agza((agzi)aqey.a);
            }
            case 3: {
                return new aqey();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqey.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u100a\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
