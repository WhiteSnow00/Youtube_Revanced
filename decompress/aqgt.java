import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$GestureOptions;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgt extends ahcu implements ahcv
{
    public static final aqgt a;
    private static volatile ahev i;
    public int b;
    public int c;
    public int d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    public CommandOuterClass$GestureOptions g;
    public CommandOuterClass$GestureOptions h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aqgt.class, (ahcz)(a = new aqgt()));
    }
    
    private aqgt() {
        this.j = 2;
    }
    
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
                if ((i = aqgt.i) == null) {
                    synchronized (aqgt.class) {
                        if (aqgt.i == null) {
                            aqgt.i = (ahev)new ahcs((ahcz)aqgt.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqgt.a;
            }
            case 4: {
                return new ahct((ahcu)aqgt.a);
            }
            case 3: {
                return new aqgt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgt.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1009\u0004\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
