import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqij extends agzi implements ahax
{
    public static final aqij a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public float e;
    public CommandOuterClass$Command f;
    private byte h;
    
    static {
        final aqij a2 = new aqij();
        agzi.registerDefaultInstance((Class)aqij.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 455760581, ahcm.k, (Class)aqij.class);
    }
    
    private aqij() {
        this.h = 2;
        this.d = "";
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
                final ahbe g;
                if ((g = aqij.g) == null) {
                    synchronized (aqij.class) {
                        if (aqij.g == null) {
                            aqij.g = (ahbe)new agzb((agzi)aqij.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqij.a;
            }
            case 4: {
                return new agza((agzi)aqij.a);
            }
            case 3: {
                return new aqij();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqij.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1001\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
