import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpk extends ahcz implements aheo
{
    public static final aqpk a;
    public static final ahcx b;
    private static volatile ahev i;
    public int c;
    public int d;
    public int e;
    public int f;
    public aqqc g;
    public CommandOuterClass$Command h;
    private byte j;
    
    static {
        final aqpk a2 = new aqpk();
        ahcz.registerDefaultInstance(aqpk.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 363654335, ahgc.k, aqpk.class);
    }
    
    private aqpk() {
        this.j = 2;
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
                final ahev i;
                if ((i = aqpk.i) == null) {
                    synchronized (aqpk.class) {
                        if (aqpk.i == null) {
                            aqpk.i = (ahev)new ahcs((ahcz)aqpk.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqpk.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpk.a);
            }
            case 3: {
                return new aqpk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpk.a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0001\u0002\u1004\u0001\u0003\u1004\u0002\u0005\u1009\u0004\u0006\u1409\u0005\u0007\u1004\u0003", new Object[] { "c", "d", "e", "g", "h", "f" });
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
