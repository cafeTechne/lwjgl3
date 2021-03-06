/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Transient index buffer.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code data} &ndash; pointer to data</li>
 * <li>{@code size} &ndash; data size</li>
 * <li>{@code handle} &ndash; index buffer handle</li>
 * <li>{@code startIndex} &ndash; first index</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_transient_index_buffer_t {
 *     uint8_t * data;
 *     uint32_t size;
 *     bgfx_index_buffer_handle_t handle;
 *     uint32_t startIndex;
 * }</code></pre>
 */
@NativeType("struct bgfx_transient_index_buffer_t")
public class BGFXTransientIndexBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        SIZE,
        HANDLE,
        STARTINDEX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(2),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        HANDLE = layout.offsetof(2);
        STARTINDEX = layout.offsetof(3);
    }

    BGFXTransientIndexBuffer(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXTransientIndexBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXTransientIndexBuffer(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("uint8_t *")
    public ByteBuffer data() { return ndata(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** Returns the value of the {@code handle} field. */
    @NativeType("bgfx_index_buffer_handle_t")
    public short handle() { return nhandle(address()); }
    /** Returns the value of the {@code startIndex} field. */
    @NativeType("uint32_t")
    public int startIndex() { return nstartIndex(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public BGFXTransientIndexBuffer data(@NativeType("uint8_t *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code handle} field. */
    public BGFXTransientIndexBuffer handle(@NativeType("bgfx_index_buffer_handle_t") short value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code startIndex} field. */
    public BGFXTransientIndexBuffer startIndex(@NativeType("uint32_t") int value) { nstartIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXTransientIndexBuffer set(
        ByteBuffer data,
        short handle,
        int startIndex
    ) {
        data(data);
        handle(handle);
        startIndex(startIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXTransientIndexBuffer set(BGFXTransientIndexBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link BGFXTransientIndexBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXTransientIndexBuffer malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link BGFXTransientIndexBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXTransientIndexBuffer calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link BGFXTransientIndexBuffer} instance allocated with {@link BufferUtils}. */
    public static BGFXTransientIndexBuffer create() {
        return new BGFXTransientIndexBuffer(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXTransientIndexBuffer} instance for the specified memory address. */
    public static BGFXTransientIndexBuffer create(long address) {
        return new BGFXTransientIndexBuffer(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXTransientIndexBuffer createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link BGFXTransientIndexBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXTransientIndexBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXTransientIndexBuffer} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXTransientIndexBuffer mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXTransientIndexBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXTransientIndexBuffer callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransientIndexBuffer mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransientIndexBuffer callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + BGFXTransientIndexBuffer.DATA), nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + BGFXTransientIndexBuffer.SIZE); }
    /** Unsafe version of {@link #handle}. */
    public static short nhandle(long struct) { return memGetShort(struct + BGFXTransientIndexBuffer.HANDLE); }
    /** Unsafe version of {@link #startIndex}. */
    public static int nstartIndex(long struct) { return memGetInt(struct + BGFXTransientIndexBuffer.STARTINDEX); }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + BGFXTransientIndexBuffer.DATA, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { memPutInt(struct + BGFXTransientIndexBuffer.SIZE, value); }
    /** Unsafe version of {@link #handle(short) handle}. */
    public static void nhandle(long struct, short value) { memPutShort(struct + BGFXTransientIndexBuffer.HANDLE, value); }
    /** Unsafe version of {@link #startIndex(int) startIndex}. */
    public static void nstartIndex(long struct, int value) { memPutInt(struct + BGFXTransientIndexBuffer.STARTINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXTransientIndexBuffer.DATA));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link BGFXTransientIndexBuffer} structs. */
    public static class Buffer extends StructBuffer<BGFXTransientIndexBuffer, Buffer> implements NativeResource {

        /**
         * Creates a new {@link BGFXTransientIndexBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXTransientIndexBuffer#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected BGFXTransientIndexBuffer newInstance(long address) {
            return new BGFXTransientIndexBuffer(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("uint8_t *")
        public ByteBuffer data() { return BGFXTransientIndexBuffer.ndata(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return BGFXTransientIndexBuffer.nsize(address()); }
        /** Returns the value of the {@code handle} field. */
        @NativeType("bgfx_index_buffer_handle_t")
        public short handle() { return BGFXTransientIndexBuffer.nhandle(address()); }
        /** Returns the value of the {@code startIndex} field. */
        @NativeType("uint32_t")
        public int startIndex() { return BGFXTransientIndexBuffer.nstartIndex(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public BGFXTransientIndexBuffer.Buffer data(@NativeType("uint8_t *") ByteBuffer value) { BGFXTransientIndexBuffer.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code handle} field. */
        public BGFXTransientIndexBuffer.Buffer handle(@NativeType("bgfx_index_buffer_handle_t") short value) { BGFXTransientIndexBuffer.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code startIndex} field. */
        public BGFXTransientIndexBuffer.Buffer startIndex(@NativeType("uint32_t") int value) { BGFXTransientIndexBuffer.nstartIndex(address(), value); return this; }

    }

}