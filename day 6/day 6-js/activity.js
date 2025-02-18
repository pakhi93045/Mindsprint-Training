class Product {
    constructor(id, name, price, category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

class Cart {
    constructor() {
        this.cart = [];
    }

    addItem(product) {
        // By default, quantity will be 1
        this.cart.push({ product, quantity: 1 });
    }

    removeItem(productId) {
        // Remove item by product ID
        this.cart = this.cart.filter(item => item.product.id !== productId);
    }

    updateItem(productId) {
        // Increase the quantity by 1
        this.cart = this.cart.map(item => {
            if (item.product.id === productId) {
                return { ...item, quantity: item.quantity + 1 };
            }
            return item;
        });
    }

    showTotalAmount() {
        // Calculate the total amount
        const total = this.cart.reduce((sum, item) => sum + item.product.price * item.quantity, 0);
        console.log('Total Amount:', total);
    }
}

const cart = new Cart();
cart.addItem(new Product(1, 'Pen', 10, 'Stationary'));
cart.addItem(new Product(2, 'Notebook', 50, 'Stationary'));
cart.updateItem(1); // Increase quantity of product with ID 1
cart.removeItem(2); // Remove product with ID 2
cart.showTotalAmount(); // Show total amount
