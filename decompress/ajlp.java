import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlp extends ahcz implements aheo
{
    public static final ajlp a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public String d;
    public CommandOuterClass$Command e;
    public ahbt f;
    public aqiq g;
    private byte i;
    
    static {
        final ajlp a2 = new ajlp();
        ahcz.registerDefaultInstance(ajlp.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 410903799, ahgc.k, ajlp.class);
    }
    
    private ajlp() {
        this.i = 2;
        this.d = "";
        this.f = ahbt.b;
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
                final ahev h;
                if ((h = ajlp.h) == null) {
                    synchronized (ajlp.class) {
                        if (ajlp.h == null) {
                            ajlp.h = (ahev)new ahcs((ahcz)ajlp.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajlp.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlp.a);
            }
            case 3: {
                return new ajlp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
