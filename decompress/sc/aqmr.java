import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmr extends ahbh implements ahcw
{
    public static final aqmr a;
    public static final ahbf b;
    private static volatile ahdd i;
    public int c;
    public int d;
    public int e;
    public int f;
    public aqnj g;
    public CommandOuterClass$Command h;
    private byte j;
    
    static {
        final aqmr a2 = new aqmr();
        ahbh.registerDefaultInstance((Class)aqmr.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhl.a, (Object)a2, (MessageLite)a2, (ahbm)null, 363654335, ahek.k, (Class)aqmr.class);
    }
    
    private aqmr() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aqmr.i) == null) {
                    synchronized (aqmr.class) {
                        if (aqmr.i == null) {
                            aqmr.i = (ahdd)new ahba((ahbh)aqmr.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqmr.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmr.a);
            }
            case 3: {
                return new aqmr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmr.a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0001\u0002\u1004\u0001\u0003\u1004\u0002\u0005\u1009\u0004\u0006\u1409\u0005\u0007\u1004\u0003", new Object[] { "c", "d", "e", "g", "h", "f" });
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
