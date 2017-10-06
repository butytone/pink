Vue.use(VueMaterial)
var app = new Vue({
    el: '#app',
    data: {
        baseUri: "http://127.0.0.1:8080/api/v1.0/",
        todos: []
    },
    mounted: function () {
        this.fetchTodos();
    },
    methods: {
        fetchTodos: function () {
            fetch(this.baseUri + "owners/qiyi/todos")
                .then(stream => stream.json())
                .then(data => this.todos = data)
                .catch(error => console.error(error));
        }
    }
});
