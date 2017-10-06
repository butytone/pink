Vue.use(VueMaterial)
var app = new Vue({
    el: '#app',
    data: {
        message: 'Hello Pink!',
        todos: [{
            "title": "Support transaction in pink",
            "completeAt": "Oct 3, 2017",
            "completed": false
        }, {
            "title": "Actrually not done",
            "completed": true
        }]
    },
    methods: {}
});
